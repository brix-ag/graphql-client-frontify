package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelineDocumentPageCategory extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteGuidelineDocumentPageCategory> {
  public RootMutation_deleteGuidelineDocumentPageCategory() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelineDocumentPageCategory", "DeleteGuidelineDocumentPageCategory"));
  }
  public RootMutation_deleteGuidelineDocumentPageCategory args(RootMutation_deleteGuidelineDocumentPageCategory_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelineDocumentPageCategory onDeleteGuidelineDocumentPageCategory(On_DeleteGuidelineDocumentPageCategory typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
