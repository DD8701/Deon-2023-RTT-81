 function printCheckerboard() {
            // Get user input
            const width = parseInt(document.getElementById('width').value);
            const height = parseInt(document.getElementById('height').value);

            // Validate input
            if (isNaN(width) || isNaN(height) || width <= 0 || height <= 0) {
                alert("Please enter valid positive numbers for width and height.");
                return;
            }

            // Build the checkerboard
            let checkerboard = '';
            for (let row = 0; row < height; row++) {
                for (let col = 0; col < width; col++) {
                    // Use an if statement to alternate between '*' and ' ' based on the coordinates
                    if ((row + col) % 2 === 0) {
                        checkerboard += '*';
                    } else {
                        checkerboard += ' ';
                    }
                }
                checkerboard += '\n'; // Move to the next row after completing a row
            }

            // Display the checkerboard
            document.getElementById('output').textContent = "Checkerboard:\n" + checkerboard;
        }







