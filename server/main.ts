import * as process from "child_process";

const output = process.execSync("g++ main.cpp && a.exe", {
  encoding: "utf-8",
});

console.log("Output was:\n", output);
