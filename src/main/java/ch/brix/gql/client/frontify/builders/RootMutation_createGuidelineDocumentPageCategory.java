package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelineDocumentPageCategory extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelineDocumentPageCategory> {
  public RootMutation_createGuidelineDocumentPageCategory() {
    super(new ch.brix.gql.client.Call<>("createGuidelineDocumentPageCategory", "CreateGuidelineDocumentPageCategory"));
  }
  public RootMutation_createGuidelineDocumentPageCategory args(RootMutation_createGuidelineDocumentPageCategory_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelineDocumentPageCategory onCreateGuidelineDocumentPageCategory(On_CreateGuidelineDocumentPageCategory typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
