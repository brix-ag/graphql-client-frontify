package ch.brix.gql.client.frontify.builders;

public class RootMutation_duplicateGuidelineDocumentPage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DuplicateGuidelineDocumentPage> {
  public RootMutation_duplicateGuidelineDocumentPage() {
    super(new ch.brix.gql.client.Call<>("duplicateGuidelineDocumentPage", "DuplicateGuidelineDocumentPage"));
  }
  public RootMutation_duplicateGuidelineDocumentPage args(RootMutation_duplicateGuidelineDocumentPage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_duplicateGuidelineDocumentPage onDuplicateGuidelineDocumentPage(On_DuplicateGuidelineDocumentPage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
