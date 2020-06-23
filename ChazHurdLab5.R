install.packages('rpart')
install.packages('caret')
install.packages('rpart.plot')


library(rpart)
library(caret)
library(rpart.plot)

mush <- read_csv("C:/Users/vanil/OneDrive/Desktop/mushrooms.csv")
str(mushrooms)

mush<-mush[,-which(names(mush)%in%c("veil_type"))]
sum(is.na(mush))

table(mush$type, mush$odor)
chisq.test(table(mush$type,mush$odor))

msize<- floor(round(0.80*nrow(mush)))
set.seed(123)
train_in<- sample(seq_len(nrow(mush)), size = msize)
train<-mush[train_in, ]
test<-mush[-train_in, ]

tree <- rpart(mush, data = train, method = "class")
rpart.plot(fit)

final <- predict(tree,test, type = "class")
View(final)
tbl1<-table(test$type, final)
View(tbl1)
confusionMatrix(tbl1)
