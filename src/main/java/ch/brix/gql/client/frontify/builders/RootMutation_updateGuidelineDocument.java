package ch.brix.gql.client.frontify.builders;

public class RootMutation_updateGuidelineDocument extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.UpdateGuidelineDocument> {
  public RootMutation_updateGuidelineDocument() {
    super(new ch.brix.gql.client.Call<>("updateGuidelineDocument", "UpdateGuidelineDocument"));
  }
  public RootMutation_updateGuidelineDocument args(RootMutation_updateGuidelineDocument_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_updateGuidelineDocument onUpdateGuidelineDocument(On_UpdateGuidelineDocument typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
