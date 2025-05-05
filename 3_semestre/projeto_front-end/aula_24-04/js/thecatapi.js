const getCats = async () => {
    try {
        const response = await fetch('https://api.thecatapi.com/v1/images/search?limit=10&api_key=live_H02fkRya2y5BFj6nWq2H0XWUbndAmnNSNsf9peJl9O8X0FiMmK4C0SIEw9xqgb3o');
        const data = await response.json();
        return data;
    }

    catch (error) {
        console.log(error);
        return [];
    }}

    export default getCats;