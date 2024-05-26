import React from "react";
import CompilersLogo from "../compilersLogo/CompilersLogo";
import "./Main.css";

import cppUrl from "../../assets/cpp_image.png";
import jsUrl from "../../assets/js_image.png";

const compilers = [
  {
    name: "C++ compiler",
    url: cppUrl,
  },
  {
    name: "JS compiler",
    url: jsUrl,
  },
];

export default function Main() {
  return (
    <div className="Main">
      <CompilersLogo compilers={compilers} />
    </div>
  );
}
