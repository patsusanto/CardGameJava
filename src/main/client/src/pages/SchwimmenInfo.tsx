import React from "react";
import MenuButton from "../components/MenuButton";

function SchwimmenInfo() {
    return(
        <>
            <div>
                <h1 className="p-5">Schwimmen</h1>
            </div>
            <div className="flex flex-col">
                <MenuButton btnName="Start Game" />
                <MenuButton btnName="Rules" />
            </div>
        </>
    );
}

export default SchwimmenInfo