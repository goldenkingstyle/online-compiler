import React from "react";
import "./TypeButton.css";

interface TypeButtonProps {
  type: string;
}

export default function TypeButton({ type }: TypeButtonProps) {
  return <div className="TypeButton">{type}</div>;
}
