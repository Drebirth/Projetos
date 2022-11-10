import { Component, Input, OnChanges } from "@angular/core";


@Component({
    selector: 'app-star',
    templateUrl: './star.component.html',
    styleUrls: ['./star.component.css']
})
export class StarComponent implements OnChanges {
//Input ela torna este component elegivel para receber informacoes de um component externo
        @Input()
        rating: number = 0;
        
        starWidth: number;

    ngOnChanges(): void{
            this.starWidth = this.rating * 74 / 5;
    }
}