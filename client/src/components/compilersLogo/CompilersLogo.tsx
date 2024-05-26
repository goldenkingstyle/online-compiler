import React from "react";
import { ICompiler } from "../../types/types";
import CompilerLogo from "../compilerLogo/CompilerLogo";
import "./CompilersLogo.css";

interface CompilersLogoProps {
  compilers: Array<ICompiler>;
}

export default function CompilersLogo({ compilers }: CompilersLogoProps) {
  return (
    <div className="Compilers">
      {compilers.map((compiler, index) => (
        <CompilerLogo key={index} compiler={compiler} />
      ))}
    </div>
  );
}
