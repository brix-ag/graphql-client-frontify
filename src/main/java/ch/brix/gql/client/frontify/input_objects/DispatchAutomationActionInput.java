package ch.brix.gql.client.frontify.input_objects;

public class DispatchAutomationActionInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** Automation execution id.
   */
  public DispatchAutomationActionInput executionId(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("executionId", v);
    return this;
  }
  /**
   * **BETA** `Automation` id.
   */
  public DispatchAutomationActionInput automationId(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("automationId", v);
    return this;
  }
  /**
   * **BETA** Automation action id.
   */
  public DispatchAutomationActionInput actionId(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("actionId", v);
    return this;
  }
  /**
   * **BETA** Automation workflow node name.
   */
  public DispatchAutomationActionInput nodeName(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("nodeName", v);
    return this;
  }
  /**
   * **BETA** Resolved automation action payload.
   */
  public DispatchAutomationActionInput action(ch.brix.gql.client.frontify.scalars.JsonObjectScalar v) {
    values.put("action", v);
    return this;
  }
}
