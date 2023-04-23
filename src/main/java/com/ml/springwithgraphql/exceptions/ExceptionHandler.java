package com.ml.springwithgraphql.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.graphql.execution.ErrorType;
import org.springframework.stereotype.Component;
import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;

@Component
public class ExceptionHandler extends DataFetcherExceptionResolverAdapter {

    @Override
    protected GraphQLError resolveToSingleError(Throwable ex, DataFetchingEnvironment env) {
        ErrorType type;
        if (ex instanceof DataIntegrityViolationException) {
            type = ErrorType.BAD_REQUEST;
        } else {
            type = ErrorType.INTERNAL_ERROR;
        }
        return GraphqlErrorBuilder.newError(env)
                .message("Received Message: failed handle the request")
                .errorType(type)
                .build();
    }
}
