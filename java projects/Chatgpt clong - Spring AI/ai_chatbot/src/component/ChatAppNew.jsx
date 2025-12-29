import { useEffect, useState, useRef } from "react";
import ChatInput from "./ChatInput";
import axios from "axios";
import ReactMarkdown from "react-markdown";

function ChatAppNew() {
    const [messages, setMessages] = useState([]);
    const [loading, setLoading] = useState(false);
    const [botTypingText, setBotTypingText] = useState("");

    const bottomRef = useRef(null);

    // 🚀 SEND MESSAGE (fixed: accepts text)
    const sendMessage = async (text) => {
        if (!text.trim()) return;

        const userMessage = { sender: "user", text };
        setMessages((prev) => [...prev, userMessage]);

        setLoading(true);

        try {
            const response = await axios.post(
                "http://localhost:8080/api/chat/prompt",
                { prompt: text }
            );

            setLoading(false);

            const botText = response.data.response;
            setBotTypingText("");

            // Typewriter effect
            let index = 0;
            const speed = 25;

            const interval = setInterval(() => {
                if (index < botText.length) {
                    setBotTypingText((prev) => prev + botText[index]);
                    index++;
                } else {
                    clearInterval(interval);

                    // push final bot message
                    setMessages((prev) => [
                        ...prev,
                        { sender: "bot", text: botText },
                    ]);

                    setBotTypingText("");
                }
            }, speed);
        } catch (error) {
            setLoading(false);
            setMessages((prev) => [
                ...prev,
                { sender: "bot", text: "⚠️ Error contacting server." },
            ]);
        }
    };

    // 🚀 FILE UPLOAD
    const uploadFile = async (file) => {
        const formData = new FormData();
        formData.append("file", file);

        try {
            const response = await axios.post(
                "http://localhost:8080/api/chat/upload",
                formData,
                {
                    headers: { "Content-Type": "multipart/form-data" },
                }
            );

            setMessages((prev) => [
                ...prev,
                { sender: "bot", text: response.data.response },
            ]);
        } catch (error) {
            setMessages((prev) => [
                ...prev,
                { sender: "bot", text: "⚠️ File upload failed." },
            ]);
        }
    };

    // 🚀 VOICE INPUT
    const startListening = () => {
        const SpeechRecognition =
            window.SpeechRecognition || window.webkitSpeechRecognition;

        if (!SpeechRecognition) {
            alert("Speech Recognition not supported.");
            return;
        }

        const recog = new SpeechRecognition();
        recog.lang = "en-US";

        recog.onresult = (e) => {
            const voiceText = e.results[0][0].transcript;
            sendMessage(voiceText);
        };

        recog.start();
    };

    // 🚀 AUTO SCROLL
    useEffect(() => {
        bottomRef.current?.scrollIntoView({ behavior: "smooth" });
    }, [messages, botTypingText, loading]);

    return (
        <div style={styles.container}>
            <div style={styles.chatWindow}>
                {messages.map((msg, index) => (
                    <div
                        key={index}
                        style={
                            msg.sender === "user"
                                ? styles.userMsg
                                : styles.botMsg
                        }
                    >
                        <ReactMarkdown>{msg.text}</ReactMarkdown>
                    </div>
                ))}

                {botTypingText && (
                    <div style={styles.botMsg}>
                        <ReactMarkdown>{botTypingText}</ReactMarkdown>
                    </div>
                )}

                {loading && (
                    <div style={styles.botMsg}>
                        <div className="typing-indicator">
                            <span>.</span><span>.</span><span>.</span>
                        </div>
                    </div>
                )}

                <div ref={bottomRef} />
            </div>

            <ChatInput
                onSendMessage={sendMessage}
                onFileUpload={uploadFile}
                onVoiceStart={startListening}
            />
        </div>
    );
}

export default ChatAppNew;

const styles = {
    container: {
        width: "100%",
        height: "100vh",
        display: "flex",
        flexDirection: "column",
        background: "#0d0d0d",
        color: "white",
    },
    chatWindow: {
        flex: 1,
        overflowY: "auto",
        padding: "20px",
    },
    userMsg: {
        marginBottom: "12px",
        padding: "2px 15px",
        background: "#4f8cff",
        borderRadius: "10px",
        maxWidth: "70%",
        marginLeft: "auto",
        color: "white",
    },
    botMsg: {
        marginBottom: "12px",
        padding: "2px 15px",
        background: "#262626",
        borderRadius: "10px",
        maxWidth: "70%",
        marginRight: "auto",
        color: "white",
    },
};