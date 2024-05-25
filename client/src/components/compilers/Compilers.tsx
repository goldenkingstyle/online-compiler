import React from "react";
import { ICompiler } from "../../types/types";
import Compiler from "../compiler/Compiler";
import "./Compilers.css";

interface CompilersProps {
  compilers: Array<ICompiler>;
}

export default function Compilers({ compilers }: CompilersProps) {
  return (
    <div className="Compilers">
      {compilers.map((compiler) => (
        <Compiler compiler={compiler} />
      ))}
    </div>
  );
}
