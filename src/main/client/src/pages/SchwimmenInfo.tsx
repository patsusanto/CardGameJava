import React from "react";
import MenuButton from "../components/buttons/MenuButton";
import { Link } from "react-router-dom";

function SchwimmenInfo() {
    return(
        <>
            <div className="flex flex-row text-center ">
                <div className="flex flex-col text-center w-1/2">
                    <h1 className="p-3">Schwimmen</h1>
                    <Link to='/schwimmengame'><MenuButton btnName="Start Game" /></Link>
                    <Link to='/'><MenuButton btnName='Back to menu' /></Link>
                </div>
                <div className="flex flex-col text-center w-1/2">
                    <h1 className="p-3">Rules:</h1>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ab nobis rem culpa impedit, qui dicta, saepe deserunt accusantium ipsam nam sit aliquid earum expedita facere, possimus obcaecati minus eaque animi.</p>
                </div>
                
            </div>
        </>
    );
}

export default SchwimmenInfo;