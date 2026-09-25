package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for workflow status. Exactly one field must be set.
 */
public class WorkflowStatusFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets whose workflow status is ANY of these.
   */
  public WorkflowStatusFilterInput isAny(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("isAny", v);
    return this;
  }
  /**
   * Match assets whose workflow status is NONE of these.
   */
  public WorkflowStatusFilterInput isNotAny(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("isNotAny", v);
    return this;
  }
  /**
   * Match assets with no workflow status assigned. Must be `true` when provided.
   */
  public WorkflowStatusFilterInput isEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isEmpty", v);
    return this;
  }
  /**
   * Match assets with a workflow status assigned. Must be `true` when provided.
   */
  public WorkflowStatusFilterInput isNotEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isNotEmpty", v);
    return this;
  }
}
