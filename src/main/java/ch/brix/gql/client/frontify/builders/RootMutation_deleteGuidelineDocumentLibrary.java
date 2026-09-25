package ch.brix.gql.client.frontify.builders;

public class RootMutation_deleteGuidelineDocumentLibrary extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.DeleteGuidelineDocumentLibrary> {
  public RootMutation_deleteGuidelineDocumentLibrary() {
    super(new ch.brix.gql.client.Call<>("deleteGuidelineDocumentLibrary", "DeleteGuidelineDocumentLibrary"));
  }
  public RootMutation_deleteGuidelineDocumentLibrary args(RootMutation_deleteGuidelineDocumentLibrary_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_deleteGuidelineDocumentLibrary onDeleteGuidelineDocumentLibrary(On_DeleteGuidelineDocumentLibrary typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
