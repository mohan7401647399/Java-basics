import axios from "axios";
import { useEffect, useRef, useState } from "react";
import Reactmarkdown from "react-markdown";

const ChatApp = () => {
    const [messages, setMessages] = useState([]);
    const [input, setInput] = useState("");
    const [loading, setLoading] = useState(false);
    const [botTypingText, setBotTypingText] = useState("");

    const bottomRef = useRef(null);

    // 🚀 SEND MESSAGE
    const sendMessage = async () => {
        if (!input.trim()) return;

        // push user message
        const userMessage = { sender: "user", text: input };
        setMessages((prev) => [...prev, userMessage]);
        setInput("");

        setLoading(true);

        // API CALL
        const response = await axios.post("http://localhost:8080/api/chat/prompt", {
            prompt: userMessage.text,
        });

        setLoading(false);

        const botText = response.data.response;
        setBotTypingText(""); // reset animation

        // Typewriter effect
        let index = 0;
        const speed = 30;

        const typeInterval = setInterval(() => {
            if (index < botText.length) {
                setBotTypingText((prev) => prev + botText[index]);
                index++;
            } else {
                clearInterval(typeInterval);

                // final clean bot message added once
                setMessages((prev) => [...prev, { sender: "bot", text: botText }]);
                setBotTypingText(""); // clear typing bubble
            }
        }, speed);
    };


    // 🚀 SPEECH RECOGNITION FIXED
    const startListening = () => {
        const SpeechRecognition =
            window.SpeechRecognition || window.webkitSpeechRecognition;

        if (!SpeechRecognition) {
            alert("Speech recognition not supported in this browser.");
            return;
        }

        const recognition = new SpeechRecognition();
        recognition.lang = "en-US";

        recognition.onresult = (event) => {
            setInput(event.results[0][0].transcript);
        };

        recognition.start();
    };

    // 🚀 FILE UPLOAD
    const uploadFile = async (e) => {
        const file = e.target.files[0];
        if (!file) return;

        const formData = new FormData();
        formData.append("file", file);

        const response = await axios.post(
            "http://localhost:8080/api/chat/upload",
            formData,
            { headers: { "Content-Type": "multipart/form-data" } }
        );

        const botMsg = { sender: "bot", text: response.data.response };
        setMessages((prev) => [...prev, botMsg]);

        // window.speechSynthesis.speak(new SpeechSynthesisUtterance(botMsg.text));
    };

    useEffect(() => {
        bottomRef.current?.scrollIntoView({ behavior: "smooth" });
    }, [messages, botTypingText, loading]);


    return (
        <div className="chat-container">
            <div className='chat-window'>
                {messages.map((msg, index) => (
                    <div key={index} className={`msg${msg.sender}`}>
                        <Reactmarkdown>{msg.text}</Reactmarkdown>
                    </div>
                ))}

                {/* Bot typing effect */}
                {botTypingText && (
                    <div className="msgbot">
                        <Reactmarkdown>{botTypingText}</Reactmarkdown>
                    </div>
                )}

                {/* Bot loading animation */}
                {loading && (
                    <div className="msgbot typing-indicator">
                        <div className="dots">
                            <span></span><span></span><span></span>
                        </div>
                    </div>
                )}
                <div ref={bottomRef} />
            </div>


            <div className="input-area">
                <input
                    className="chat-input"
                    value={input}
                    onChange={(e) => setInput(e.target.value)}
                    placeholder="Ask something..."
                />

                <button className="send-btn" onClick={sendMessage}>
                    Send
                </button>

                <button className="voice-btn" onClick={startListening}>
                    🎤
                </button>

                <label className="file-btn">
                    📁
                    <input type="file" hidden onChange={uploadFile} />
                </label>
            </div>
        </div>
    );
};

export default ChatApp;
