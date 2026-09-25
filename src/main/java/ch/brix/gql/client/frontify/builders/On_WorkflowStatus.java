package ch.brix.gql.client.frontify.builders;

public class On_WorkflowStatus extends ch.brix.gql.client.TypeBuilder {
  public On_WorkflowStatus() {
    super(new ch.brix.gql.client.On("WorkflowStatus"));
  }
  /**
   * **BETA** `WorkflowStatus` id.
   */
  public On_WorkflowStatus id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The name of the `WorkflowStatus`.
   */
  public On_WorkflowStatus name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The color of the `WorkflowStatus`.
   */
  public On_WorkflowStatus color(WorkflowStatus_color callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** List of `User` assigned to this `WorkflowStatus`.
   */
  public On_WorkflowStatus assignedUsers(WorkflowStatus_assignedUsers callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** A list of `WorkflowPreset` that is used to create one or more `WorkflowChecklistItem`, which are appended to a `WorkflowTask` on entering this `WorkflowState`.
   */
  public On_WorkflowStatus checklistPresets(WorkflowStatus_checklistPresets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** A list of the `WorkflowTask` in the `WorkflowStatus`.
   */
  public On_WorkflowStatus tasks(WorkflowStatus_tasks callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** A list of `WorkflowStatusEnterRule` which needs to be satisfied before a `WorkflowTask` can enter this `WorkflowStatus`.
   */
  public On_WorkflowStatus enterRules() {
    _add_field("enterRules");
    return this;
  }
}
