package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelineDocumentLibrary extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelineDocumentLibrary> {
  public RootMutation_updateGuidelineDocumentLibrary() {
    super(new ch.brix.gql.client.Call<>("updateGuidelineDocumentLibrary", "UpdateGuidelineDocumentLibrary"));
  }
  public RootMutation_updateGuidelineDocumentLibrary args(RootMutation_updateGuidelineDocumentLibrary_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelineDocumentLibrary onUpdateGuidelineDocumentLibrary(On_UpdateGuidelineDocumentLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
