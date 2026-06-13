import React, { useRef, useState } from "react";
import { FaPaperclip, FaMicrophone, FaPaperPlane } from "react-icons/fa";

const ChatInput = ({ onSendMessage, onFileUpload, onVoiceStart }) => {
    const [input, setInput] = useState("");
    const fileRef = useRef(null);

    const handleSend = () => {
        if (!input.trim()) return;
        onSendMessage(input);
        setInput("");
    };

    const handleFileSelect = (e) => {
        const file = e.target.files[0];
        if (file) onFileUpload(file);
    };

    return (
        <div style={styles.wrapper}>
            <input
                type="file"
                ref={fileRef}
                onChange={handleFileSelect}
                style={{ display: "none" }}
            />

            <div style={styles.inputBox}>
                <button style={styles.iconBtn} onClick={() => fileRef.current.click()}>
                    <FaPaperclip size={18} />
                </button>

                <input
                    type="text"
                    placeholder="Send a message..."
                    value={input}
                    onChange={(e) => setInput(e.target.value)}
                    style={styles.input}
                />

                <button style={styles.iconBtn} onClick={onVoiceStart}>
                    <FaMicrophone size={18} />
                </button>

                <button style={styles.sendBtn} onClick={handleSend}>
                    <FaPaperPlane size={18} />
                </button>
            </div>
        </div>
    );
};

export default ChatInput;

const styles = {
    wrapper: {
        width: "100%",
        padding: "12px",
        background: "#1e1e1e",
    },
    inputBox: {
        display: "flex",
        alignItems: "center",
        padding: "8px 12px",
        background: "#2d2d2d",
        borderRadius: "30px",
        border: "1px solid #3a3a3a",
        gap: "10px",
    },
    input: {
        flex: 1,
        background: "transparent",
        border: "none",
        outline: "none",
        color: "white",
        fontSize: "16px",
    },
    iconBtn: {
        background: "transparent",
        border: "none",
        color: "#cfcfcf",
        cursor: "pointer",
    },
    sendBtn: {
        background: "#4f8cff",
        border: "none",
        padding: "10px",
        borderRadius: "50%",
        color: "white",
        cursor: "pointer",
    },
};