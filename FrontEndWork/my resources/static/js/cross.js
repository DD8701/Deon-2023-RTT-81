function printCross() {
            // Get user input
            const size = parseInt(document.getElementById('size').value);

            // Validate input
            if (isNaN(size) || size <= 0) {
                alert("Please enter a valid positive number for the size.");
                return;
            }

let cross = '';
            for (let row = 0; row < size; row++) {
                for (let col = 0; col < size; col++) {
                    // Use an if statement to determine whether to print '*' or ' ' based on the diagonal condition
                    if (row === col || row + col === size - 1) {
                        cross += '*';
                    } else {
                        cross += ' ';
                    }
                }
                cross += '\n'; // Move to the next row after completing a row
            }
            document.getElementById('output').textContent = "Diagonal Cross:\n" + cross;
            }