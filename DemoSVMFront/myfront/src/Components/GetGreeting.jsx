import React, {useState, useEffect} from "react";
import axios from "axios";

const GetGreeting = () => {
    const apiUrl = "http://localhost:8080/";

    const GreetingData = [
        {id: 1, content: "Sin contenido"},
    ];
    const [greeting, setGreeting] = useState(GreetingData);
    const [showLoading, seShowLoading] = useState(true);

    useEffect(() => {
        const fetchData = async () => {
            const result = await axios (apiUrl + "greeting?name=Sarah");
            setGreeting(result.data);
        };
        fetchData();
    },
    []);
    return (
        <div className="container">
            <h1>{greeting.content}</h1>
        </div>
    );
};
export default GetGreeting;