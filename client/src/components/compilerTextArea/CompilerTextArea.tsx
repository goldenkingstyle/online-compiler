import React from "react";
import "./CompilerTextArea.css";
import {Rows} from "../rows/Rows";

export default function CompilerTextArea() {
    return <div className="CompilerTextArea">
        <Rows/>
        <textarea className="compiler-input" />
    </div>;
}
