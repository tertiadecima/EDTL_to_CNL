В проекте представлена контекстно-свободная грамматика, разработанная в среде Eclipse при помощи библиотек XText и Stanford CoreNLP; грамматика описывает все возможные представления формул LTL-семантики для EDTL (Event-driven Temporal Requirements) на английском языке.

Полная LTL-семантика выглядит как как G ((trig ∧ (¬ rel)) → ((inv ∧ (¬ fin)) W (fin ∧ ((inv ∧ (¬ del)) W (rel v (inv ∧ rea)))))). 
Ее представление на естественном языке выглядит как “After TRIGGER, INVARIANT should remain valid until either RELEASE or REACTION, which must occur within DELAY from FINAL”, и имеет определенные описанные грамматикой вариации

Перед запуском грамматики необходимо скачать и добавить в путь org.xtext.cnl\src\lib\ файлы _stanford-corenlp-4.5.7.jar_ и _stanford-corenlp-4.5.7-models.jar_.
