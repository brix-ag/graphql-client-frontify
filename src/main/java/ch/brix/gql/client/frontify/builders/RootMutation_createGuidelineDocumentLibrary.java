package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelineDocumentLibrary extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelineDocumentLibrary> {
  public RootMutation_createGuidelineDocumentLibrary() {
    super(new ch.brix.gql.client.Call<>("createGuidelineDocumentLibrary", "CreateGuidelineDocumentLibrary"));
  }
  public RootMutation_createGuidelineDocumentLibrary args(RootMutation_createGuidelineDocumentLibrary_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelineDocumentLibrary onCreateGuidelineDocumentLibrary(On_CreateGuidelineDocumentLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
