package org.zstack.header.vm;

import org.zstack.header.errorcode.ErrorCode;

public interface VmInstanceMigrateExtensionPoint {
    String preMigrateVm(VmInstanceInventory inv, String destHostUuid);
    
    void beforeMigrateVm(VmInstanceInventory inv, String destHostUuid);
    
    void afterMigrateVm(VmInstanceInventory inv, String destHostUuid);
    
    void failedToMigrateVm(VmInstanceInventory inv, String destHostUuid, ErrorCode reason);
}
