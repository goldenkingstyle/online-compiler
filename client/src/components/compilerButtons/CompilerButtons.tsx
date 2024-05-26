import React from "react";
import RunButton from "../runButton/RunButton";
import TypeButton from "../typeButton/TypeButton";
import "./CompilerButtons.css";

interface CompilerButtonsProps {
  type: string;
}

export default function CompilerButtons({ type }: CompilerButtonsProps) {
  return (
    <div className="CompilerButtons">
      <RunButton />
      <TypeButton type={type} />
    </div>
  );
}
