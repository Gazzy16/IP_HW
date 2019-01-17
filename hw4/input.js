regExps = {
"exercise_1": /[A-Z][a-z]+/,
"exercise_2": /088[1-9][1-9][1-9][1-9][1-9][1-9][1-9]/,
"exercise_3": /[^10][^10]|[^10]/,
"exercise_4": /^[^._0-9n].*$/,
"exercise_5": /1[0-4][0-9][0-9]|999|1[1-5]00/,
"exercise_6": /class='.*'|class=".*"/
};
cssSelectors = {
"exercise_1": "item > java",
"exercise_2": "different > java",
"exercise_3": "java > tag.class1.class2",
"exercise_4": "#someId ~ item",
"exercise_5": "tag > java.class1 + java.class1",
"exercise_6": "#someId item > item > item > item",
"exercise_7": "different #diffId2 > java + java",
"exercise_8": "#someId"
};
