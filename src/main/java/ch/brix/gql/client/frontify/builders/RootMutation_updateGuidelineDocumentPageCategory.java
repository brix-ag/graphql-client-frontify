package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelineDocumentPageCategory extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelineDocumentPageCategory> {
  public RootMutation_updateGuidelineDocumentPageCategory() {
    super(new ch.brix.gql.client.Call<>("updateGuidelineDocumentPageCategory", "UpdateGuidelineDocumentPageCategory"));
  }
  public RootMutation_updateGuidelineDocumentPageCategory args(RootMutation_updateGuidelineDocumentPageCategory_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelineDocumentPageCategory onUpdateGuidelineDocumentPageCategory(On_UpdateGuidelineDocumentPageCategory typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
