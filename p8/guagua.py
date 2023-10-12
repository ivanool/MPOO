from rich.console import Console

console = Console()
console.print("Hello", "World!")



from time import sleep
from rich.progress import Progress
with Progress() as progress:
    task = progress.add_task("[red]Downloading...", total=100)

    while not progress.finished:
        progress.update(task, advance=0.5)
        sleep(0.02)
