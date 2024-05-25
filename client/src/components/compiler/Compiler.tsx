import React from "react";
import { ICompiler } from "../../types/types";
import "./Compiler.css";

interface CompilersProps {
  compiler: ICompiler;
}

export default function Compiler({ compiler }: CompilersProps) {
  return (
    <div className="Compiler">
      <div className="compiler-name">{compiler.name}</div>
      <img src={compiler.url} alt="compiler" />
    </div>
  );
}
