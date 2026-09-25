package ch.brix.gql.client.frontify.builders;

public class RootMutation_moveGuidelineDocumentPage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.MoveGuidelineDocumentPage> {
  public RootMutation_moveGuidelineDocumentPage() {
    super(new ch.brix.gql.client.Call<>("moveGuidelineDocumentPage", "MoveGuidelineDocumentPage"));
  }
  public RootMutation_moveGuidelineDocumentPage args(RootMutation_moveGuidelineDocumentPage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_moveGuidelineDocumentPage onMoveGuidelineDocumentPage(On_MoveGuidelineDocumentPage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
