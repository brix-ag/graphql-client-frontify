package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_workflow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Workflow> {
  public DocumentLibrary_workflow() {
    super(new ch.brix.gql.client.Call<>("workflow", "Workflow"));
  }
  public DocumentLibrary_workflow onWorkflow(On_Workflow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
