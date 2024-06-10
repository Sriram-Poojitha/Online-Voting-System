// Fetch and display results
fetch('results')
    .then(response => response.json())
    .then(data => {
        const resultsDiv = document.getElementById('results');
        data.forEach(candidate => {
            const p = document.createElement('p');
            p.textContent = `${candidate.name}: ${candidate.votes} votes`;
            resultsDiv.appendChild(p);
        });
    });
