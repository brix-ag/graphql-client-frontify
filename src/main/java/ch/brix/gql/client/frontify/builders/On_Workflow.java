package ch.brix.gql.client.frontify.builders;

public class On_Workflow extends ch.brix.gql.client.TypeBuilder {
  public On_Workflow() {
    super(new ch.brix.gql.client.On("Workflow"));
  }
  /**
   * **BETA** `Workflow` Id.
   */
  public On_Workflow id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** Multiple statuses define a `Workflow`. They represent a line/row in the Kanban board of the current `Workflow`.
   */
  public On_Workflow statuses(Workflow_statuses callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
