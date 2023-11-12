// @ts-ignore
import React, { useState, useEffect } from 'react';

function App() {
    const [druzyny, setDruzyny] = useState<{ id: number; nazwa: string }[]>([]);

    // Funkcja do pobierania drużyn z serwera
    // @ts-ignore
    const pobierzDruzyny = async () => {
        try {
            const response = await fetch('/api/druzyny'); // Zmień ścieżkę na odpowiednią
            const data = await response.json();
            setDruzyny(data);
        } catch (error) {
            console.error('Błąd pobierania drużyn:', error);
        }
    };

    // Wywołaj funkcję pobierania drużyn po zamontowaniu komponentu
    useEffect(() => {
        pobierzDruzyny();
    }, []);

    return (
        <div>
            {/* Nagłówek aplikacji */}
            <h1>Aplikacja do Zarządzania Drużynami</h1>
            {/* Lista drużyn */}
            <ListaDruzyn druzyny={druzyny} />
        </div>
    );
}

export default App;
