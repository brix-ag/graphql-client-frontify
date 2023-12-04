package ch.brix.gql.client.frontify.builders;

public class IconLibrary_workflow extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Workflow> {
  public IconLibrary_workflow() {
    super(new ch.brix.gql.client.Call<>("workflow", "Workflow"));
  }
  public IconLibrary_workflow onWorkflow(On_Workflow typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
