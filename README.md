В проекте представлен контролируемый естественный язык в формате контекстно-свободной грамматики, разработанный в среде Eclipse при помощи библиотек XText и Stanford CoreNLP; язык описывает все возможные представления формул LTL-семантики для EDTL (Event-driven Temporal Logic) на английском языке.

Семантика линейной темпоральной логики для EDTL-требования может быть выражена LTL-формулой G ((trig ∧ (¬ rel)) → ((inv ∧ (¬ fin)) W (fin ∧ ((inv ∧ (¬ del)) W (rel v (inv ∧ rea)))))) 
Представление EDTL требования на естественном языке в полном виде выглядит как «After <trigger>, <invariant> should remain valid until either <release> or <reaction>, which must occur within <delay> from <final>». В зависимости от логических переменных или частей требования на ЕЯ, которые можно поставить на место атрибутов, требование может иметь различные вариации (42 штуки). Все возможные вариации описываются грамматикой в репозитории.

Перед использованием грамматики необходимо скачать и добавить в путь org.xtext.cnl\src\lib\ файлы _stanford-corenlp-4.5.7.jar_ и _stanford-corenlp-4.5.7-models.jar_.
