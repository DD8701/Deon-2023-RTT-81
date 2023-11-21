function printShape() {
            // Get user input
            const width = parseInt(document.getElementById('width').value);
            const height = parseInt(document.getElementById('height').value);

            // Validate input
            if (isNaN(width) || isNaN(height) || width <= 0 || height <= 0) {
                alert("Please enter valid positive numbers for width and height.");
                return;
            }

            // Build the shape
            let shape = '';
            for (let i = 0; i < height; i++) {
                // Add a row of asterisks to the shape
                shape += '*'.repeat(width) + '\n';
            }

            // Display the shape
            document.getElementById('output').textContent = "Shape:\n" + shape;
        }