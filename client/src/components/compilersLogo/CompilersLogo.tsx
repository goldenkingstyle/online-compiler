import React from "react";
import { ICompiler } from "../../types/types";
import CompilerLogo from "../compilerLogo/CompilerLogo";
import "./CompilersLogo.css";

interface CompilersProps {
  compilers: Array<ICompiler>;
}

export default function Compilers({ compilers }: CompilersProps) {
  return (
    <div className="Compilers">
      {compilers.map((compiler) => (
        <CompilerLogo compiler={compiler} />
      ))}
    </div>
  );
}
