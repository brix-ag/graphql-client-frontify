package ch.brix.gql.client.frontify.builders;

public class RootMutation_createGuidelineDocument extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreateGuidelineDocument> {
  public RootMutation_createGuidelineDocument() {
    super(new ch.brix.gql.client.Call<>("createGuidelineDocument", "CreateGuidelineDocument"));
  }
  public RootMutation_createGuidelineDocument args(RootMutation_createGuidelineDocument_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_createGuidelineDocument onCreateGuidelineDocument(On_CreateGuidelineDocument typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
