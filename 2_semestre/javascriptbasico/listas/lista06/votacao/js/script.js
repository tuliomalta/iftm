const candidates = document.querySelectorAll('.candidate');
const votes = {
    minnie: 0,
    mickey: 0,
    pateta: 0,
    pluto: 0
};

function updateVotes() {
    let maxVotes = Math.max(...Object.values(votes));
    let voteCounts = Object.values(votes);
    let numMaxVotes = voteCounts.filter(v => v === maxVotes).length;

    candidates.forEach(candidate => {
        const candidateName = candidate.dataset.candidate;
        const voteCount = votes[candidateName];
        const voteDisplay = candidate.querySelector('.votes');
        voteDisplay.textContent = voteCount;

        candidate.classList.remove('highest', 'tie', 'lowest');

        if (numMaxVotes > 1 && voteCount === maxVotes) {
            candidate.classList.add('tie');
        } else if (voteCount === maxVotes) {
            candidate.classList.add('highest');
        } else {
            candidate.classList.add('lowest');
        }
    });
}

candidates.forEach(candidate => {
    candidate.addEventListener('click', () => {
        const candidateName = candidate.dataset.candidate;
        votes[candidateName]++;
        updateVotes();
    });
});
