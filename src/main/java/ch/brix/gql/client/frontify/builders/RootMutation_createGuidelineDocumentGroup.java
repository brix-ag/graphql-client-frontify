package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelineDocumentGroup extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelineDocumentGroup> {
  public RootMutation_createGuidelineDocumentGroup() {
    super(new ch.brix.gql.client.Call<>("createGuidelineDocumentGroup", "CreateGuidelineDocumentGroup"));
  }
  public RootMutation_createGuidelineDocumentGroup args(RootMutation_createGuidelineDocumentGroup_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelineDocumentGroup onCreateGuidelineDocumentGroup(On_CreateGuidelineDocumentGroup typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
