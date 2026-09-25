package ch.brix.gql.client.frontify.builders;

public class Library_workflow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Workflow> {
  public Library_workflow() {
    super(new ch.brix.gql.client.Call<>("workflow", "Workflow"));
  }
  public Library_workflow onWorkflow(On_Workflow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
