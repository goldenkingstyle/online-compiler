import React from "react";
import { useLocation } from "react-router";
import CompilerButtons from "../compilerButtons/CompilerButtons";
import CompilerTextArea from "../compilerTextArea/CompilerTextArea";
import OutputTextArea from "../outputTextArea/OutputTextArea";
import "./Compiler.css";

interface CompilerState {
  type?: string;
}

export default function Compiler() {
  const { state }: { state: CompilerState } = useLocation();
  const { type = "c++" } = state ?? {};

  return (
    <div>
      <CompilerButtons type={type} />
      <CompilerTextArea />
      <OutputTextArea />
    </div>
  );
}
