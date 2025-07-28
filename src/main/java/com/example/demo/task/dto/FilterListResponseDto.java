package com.example.demo.task.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;

@Getter
@JsonNaming(SnakeCaseStrategy.class)
public class FilterListResponseDto {

    private String key;
    private String label;


    public static List<FilterListResponseDto> toDtoList() {
        return Arrays.stream(Filter.values())
                     .map(f -> new FilterListResponseDto(f.name(), f.getLabel()))
                     .collect(Collectors.toList());
    }


    public FilterListResponseDto(String key, String label) {
        this.key = key;
        this.label = label;
    }

    public enum Filter {

        EPIC("에픽"),
        MEMBER("담당자"),
        IMPORTANCE("중요도"),
        DEPARTMENT("부서"),
        TEAM("팀"),
        UNIT("계");

        @Getter
        private String label;

        Filter(String label) {
            this.label = label;
        }
    }
}
