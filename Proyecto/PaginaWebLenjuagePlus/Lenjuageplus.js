document.getElementById('supportForm').addEventListener('submit', function(e) {
    e.preventDefault();
    
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const issue = document.getElementById('issue').value;

    const formResponse = document.getElementById('formResponse');

    // Simulate form submission
    formResponse.innerHTML = `Thank you, ${name}. Your issue has been submitted. We will contact you at ${email} soon.`;

    // Clear the form
    document.getElementById('supportForm').reset();
});

document.getElementById('downloadBtn').addEventListener('click', function() {
    alert('Starting download...');
    // You can add the actual download functionality here
});
