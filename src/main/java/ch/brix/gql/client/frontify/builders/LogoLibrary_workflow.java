package ch.brix.gql.client.frontify.builders;

public class LogoLibrary_workflow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Workflow> {
  public LogoLibrary_workflow() {
    super(new ch.brix.gql.client.Call<>("workflow", "Workflow"));
  }
  public LogoLibrary_workflow onWorkflow(On_Workflow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
