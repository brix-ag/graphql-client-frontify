package ch.brix.gql.client.frontify.builders;

public class MediaLibrary_workflow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Workflow> {
  public MediaLibrary_workflow() {
    super(new ch.brix.gql.client.Call<>("workflow", "Workflow"));
  }
  public MediaLibrary_workflow onWorkflow(On_Workflow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
