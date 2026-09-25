package ch.brix.gql.client.frontify.builders;

public class On_WorkflowTask extends ch.brix.gql.client.TypeBuilder {
  public On_WorkflowTask() {
    super(new ch.brix.gql.client.On("WorkflowTask"));
  }
  /**
   * **BETA** `WorkflowTask` Id.
   */
  public On_WorkflowTask id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** A list of `User` assigned to the `WorkflowTask`.
   */
  public On_WorkflowTask assignedUsers(WorkflowTask_assignedUsers callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The `Asset` linked to the `WorkflowTask`.
   */
  public On_WorkflowTask asset(WorkflowTask_asset callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** `WorkflowTask` title.
   */
  public On_WorkflowTask title() {
    _add_field("title");
    return this;
  }
  /**
   * **BETA** `WorkflowTask` description.
   */
  public On_WorkflowTask description() {
    _add_field("description");
    return this;
  }
  /**
   * **BETA** The `WorkflowStatus` of the `WorkflowTask`.
   */
  public On_WorkflowTask status(WorkflowTask_status callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** A list of the `WorkflowChecklistItem` in the `WorkflowTask`.
   */
  public On_WorkflowTask checklistItem(WorkflowTask_checklistItem callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
