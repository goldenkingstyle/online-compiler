import React from "react";
import { Link } from "react-router-dom";
import { ICompiler } from "../../types/types";
import "./CompilerLogo.css";

interface CompilersLogoProps {
  compiler: ICompiler;
}

export default function CompilerLogo({ compiler }: CompilersLogoProps) {
  return (
    <Link className="Compiler" to="compiler" state={{ type: compiler.type }}>
      <div className="compiler-name">{compiler.name}</div>
      <img src={compiler.url} alt="compiler" />
    </Link>
  );
}
