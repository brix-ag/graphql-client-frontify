package ch.brix.gql.client.frontify.builders;

public class WorkflowStatus_tasks_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `WorkflowTask` items to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public WorkflowStatus_tasks_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current page number.
   * Default value: 1
   */
  public WorkflowStatus_tasks_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
